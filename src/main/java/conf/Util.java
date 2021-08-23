package conf;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import model.Anime;

public class Util {

    public static void applyPlaceholder(JTextField field, String defaultText) {
        Dimension sizeOriginal = field.getPreferredSize();
        field.setText(defaultText);
        field.setPreferredSize(sizeOriginal);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(defaultText);
                field.requestFocus();
            }
        });

        field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (field.getText().equals(defaultText)) {
                    field.setText("");
                }
            }
        });

        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals("exemplo@dominio.com")) {
                    field.setCaretPosition(0);
                    field.setCaretColor(null);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().equals("")) {
                    field.setText("exemplo@dominio.com");
                }
            }
        });

    }

    public static void preventSize(JTextComponent field) {
        field.setPreferredSize(field.getPreferredSize());
    }

    public static void requestFocus(JTextComponent field) {
        field.requestFocus();
    }
    
    public static void setIcon(JLabel field, String icon) {
        Util util = new Util();
        field.setIcon(new ImageIcon(util.getClass().getResource("/static/image/" + icon)));   
    }
    
    public static void setIcon(JLabel field, String icon, int width, int heigth) {
        Util util = new Util();
        Image imageIcon = new ImageIcon(util.getClass()
                                                .getResource("/static/image/" + icon))
                                                .getImage()
                                                .getScaledInstance(width, heigth, Image.SCALE_SMOOTH);
        field.setIcon(new ImageIcon(imageIcon));   
    }
    
    public static void applyTextAreaProperties(JTextArea textArea, JScrollPane scroll) {
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBorder(null);
        scroll.setBorder(null);
        scroll.setPreferredSize(new Dimension(textArea.getWidth(), textArea.getHeight()));
    }

    public static boolean validateEmail(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public static boolean verifyIsNotEmpty(JTextComponent field, String errorMessage) {
        if (field.getText().isEmpty()) {
            requestFocus(field);
            JOptionPane.showMessageDialog(null, errorMessage);
            return false;
        }
        return true;
    }

    public static boolean verifyEmailIsValid(JTextComponent field, String errorMessage) {
        String email = field.getText();
        email = (email.equals("exemplo@dominio.com") ? "" : email);
        if (!validateEmail(email)) {
            requestFocus(field);
            JOptionPane.showMessageDialog(null, errorMessage);
            return false;
        }
        return true;
    }

    public static void message(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static DefaultTableCellRenderer getImageCellRender() {
        return new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                String photoName = value.toString();
                String filename = "src/main/resources/static/image/" + photoName;
                
                try {
                    BufferedImage bimg = ImageIO.read(new File(filename));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                ImageIcon imageIcon = new ImageIcon(
                        new ImageIcon(filename)
                                .getImage()
                                .getScaledInstance(160, 240, Image.SCALE_SMOOTH)
                );
                return new JLabel(imageIcon);
            }
        };
    }
    
    public static DefaultTableCellRenderer getNumberEpCellRender() {
        DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
            Font font = new Font("Segoe UI", 0, 20);

            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setFont(font);
                return this;
            }
        };
        
        r.setHorizontalAlignment(SwingConstants.CENTER);
        r.setHorizontalTextPosition(SwingConstants.CENTER);
        return r;
    }
    
    public static DefaultTableCellRenderer getDescriptionCellRender() {
        return new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                JTextArea textDescription = new JTextArea();
                textDescription.setLineWrap(true);
                textDescription.setWrapStyleWord(true);
                textDescription.setMargin(new java.awt.Insets(5, 5, 5, 5));
                textDescription.setText((value == null) ? "" : value.toString());  
                textDescription.setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
                if (table.getRowHeight(row) < getPreferredSize().height) {  
                    table.setRowHeight(row, getPreferredSize().height);  
                }
                return textDescription;
            }
        };
    }
        
    public static DefaultTableModel getDefaultTableMode() {
        return new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }

    public static void setOneLineTable(JTable table,
                                       int indexTable,
                                       JScrollPane scroll,
                                       Stream<Anime> animesIn,
                                       HashMap<Point, model.Anime> animesIndex) {
        DefaultTableModel model = getDefaultTableMode();

        ArrayList<Anime> animes = new ArrayList(Arrays.asList(animesIn.toArray()));
        ArrayList tableRow = new ArrayList();
        int idx = 0;
        int animesCount = 0;
        for (Anime anime : animes) {
            model.addColumn("");
            tableRow.add(anime.getImagem());
            animesIndex.put(new Point(indexTable, idx++), anime);
            animesCount++;
        }
        
        int tableWidth = (int) ((animesCount * 160) + ((animesCount-1) * 6.66));
        int scrollWidth = (int) (55.55 * animesCount);
        model.addRow(tableRow.toArray());
        table.setModel(model);
        table.setTableHeader(null);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setPreferredSize(new Dimension(tableWidth, 260));
        table.setBorder(null);
        scroll.setPreferredSize(new Dimension(scrollWidth, 50));
        scroll.setBorder(null);
        
        for (int i = 0; i < tableRow.size(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(Util.getImageCellRender());
        }
    }
    
    public static void setMultiLineTable(JTable table, 
                                         JScrollPane scroll, 
                                         ArrayList<model.Anime> animes, 
                                         HashMap<Point, Anime> animesIndex) {
        DefaultTableModel model = getDefaultTableMode();
        int qtdLine = 8;
        
        for (int i = 0; i < qtdLine; i++) {
            model.addColumn("");
        }
        
        ArrayList rows = new ArrayList();
        ArrayList tableRow = new ArrayList();
        int col = 0;
        int line = 0;
        for (model.Anime anime : animes) {
            if (anime.isFavorito()) {
                col++;
                if (col > qtdLine) {
                    line++;
                    col = 1;
                    rows.add(tableRow);
                    tableRow = new ArrayList();
                }
                tableRow.add(anime.getImagem());
                animesIndex.put(new Point(line, (col-1)), anime);
            }
        }
        
        if (col <= qtdLine) {
            for (int i = (tableRow.size()); i < qtdLine; i++) {
                col++;
                model.Anime animeEmpty = new model.Anime("empty", "empty", 0, 0, "empty.png");
                tableRow.add(animeEmpty.getImagem());
                animesIndex.put(new Point(line, (col-1)), animeEmpty);
            }
            rows.add(tableRow);
        }
        
        for (int i = 0; i < rows.size(); i++) {
            ArrayList<String> rowImage = (ArrayList<String>) rows.get(i);
            model.addRow(rowImage.toArray());
        }
        
        table.setModel(model);
        table.setTableHeader(null);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(260);
        table.setPreferredSize(new Dimension(1320, 1000));
        scroll.setPreferredSize(new Dimension(1200, 1000));
        scroll.setBorder(null);
        
        for (int i = 0; i < rows.size(); i++) {
            ArrayList<String> rowImage = (ArrayList<String>) rows.get(i);
            for (int j = 0; j < rowImage.size(); j++) {
                table.getColumnModel().getColumn(j).setCellRenderer(Util.getImageCellRender());
            }
        }
    }
}
