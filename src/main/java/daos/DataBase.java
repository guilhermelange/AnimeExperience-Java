package daos;

import exceptions.NotFoundException;
import java.util.ArrayList;
import model.Anime;
import model.Episode;
import model.PlayList;
import model.Season;
import model.User;

public class DataBase {
    private static ArrayList<User> usuarios = new ArrayList<>();
    private static ArrayList<Anime> animes = new ArrayList<>();
    private static Anime animeCarregado;
    private static Episode episodioCarregado;
    
    public static boolean addUsuario(User newUser) {
        try {
            newUser.authenticate();
            return false;
        } catch (NotFoundException e) {
            DataBase.usuarios.add(newUser);
            return true;
        }
    }

    public static ArrayList<User> getUsuarios() {
        return DataBase.usuarios;
    }
    
    public static void addAnime(Anime ... novoAnime) {
        for (Anime anime : novoAnime) {
            animes.add(anime);
        }
    }

    public static ArrayList<Anime> getAnimes() {
        return animes;
    }

    public static void setAnimeCarregado(Anime animeCarregado) {
        DataBase.animeCarregado = animeCarregado;
    }

    public static Anime getAnimeCarregado() {
        return animeCarregado;
    }

    public static void setEpisodioCarregado(Episode episodioCarregado) {
        DataBase.episodioCarregado = episodioCarregado;
    }

    public static Episode getEpisodioCarregado() {
        return episodioCarregado;
    }
    
    public static void init() {
        Anime anime1 = new Anime("Bleach", "Bleach segue as aventuras de Ichigo Kurosaki que após ganhar os poderes de um Ceifeiro de Almas, através de uma Ceifeira de Almas, Rukia Kuchiki. Com os seus novos poderes, Ichigo é forçado a assumir o dever de guiar almas boas ao mundo pós-vida à Soul Society, e derrotar os Hollows", 2006, 12, "Bleach.jpg");
        Anime anime2 = new Anime("Dragon Ball Super", "Após a derrota de Majin Buu, Goku arranja um novo emprego como... fazendeiro de nabos? Agora que a Terra está em paz, nosso heróis levam vidas mundanas, mas não por muito tempo. Longe dali, Beerus, o poderoso Deus da Destruição, recebe uma profecia de que encontrará seu fim nas mãos de um ser ainda mais poderoso, e sua busca pelo Deus dos Saiya-jins o traz para a Terra", 2015, 10, "DragonBall.jpg");
        Anime anime3 = new Anime("Digimon Adventure (2020)", "É o ano de 2020. A Rede tornou-se algo indispensável para a vida dos humanos. Mas o que eles não sabem é que, por trás da Rede, existe um mundo de luz e trevas conhecido como o Mundo Digital, habitado pelos Digimons. Quando Taichi Yagami tenta salvar sua mãe e sua irmã, que estão a bordo de um trem desgovernado, ele entra na plataforma... e um estranho fenômeno o leva para o Mundo Digital!", 2020, 0, "Digimon.jpg");
        Anime anime9 = new Anime("One Piece", "O capitão Luffy navega com sua tripulação à pocura de um tesouro que pode torná-lo o novo rei dos piratas.", 2002, 10, "OnePiece.jpg");
        Anime anime4 = new Anime("FullMetal Alchemist Brotherhood", "Os irmãos Elric participam de uma caçada ao poderoso Isaac, um ex-Alquimista Federal decidido a derrotas Fuhrer Bradley.", 2010, 14, "Fullmetal.jpg");
        Anime anime5 = new Anime("Mob Psycho 100", "Mob é um anime que desenrola-se na história de Mob, um jovem que explodirá se a sua capacidade emocional chegar aos 100%. Mob vive o drama de controlar seus poderes psíquicos para que possa viver normalmente. ", 2012, 12, "Mob.jpg");
        Anime anime6 = new Anime("Black Clover", "Num mundo onde magia é tudo, Asta e Yuno são abandonados em uma igreja no mesmo dia. Enquanto Yuno possui poderes mágicos excepcionais, Asta é a única pessoa do mundo todo desprovida desse dom. Aos quinze anos, ambos recebem grimórios - livros mágicos que amplificam os poderes do detentor. Asta recebe um raro grimório de anti-magia, capaz de negar e repelir os feitiços do oponente. Dois opostos que nutrem uma rivalidade amigável, Yuno e Asta estão prontos para encarar os mais difíceis desafios para conquistar seu sonho em comum: tornar-se o Rei dos Feiticeiros.", 2015, 12, "BlackClover.jpg");
        Anime anime7 = new Anime("Yu Gi Oh!", "Tudo muda para o jovem Yugi Muto e seus amigos Joey, Tristan e Téa quando a vida deles passa a girar em torno de um jogo de cartas fantásticas", 2005, 0, "YuGiOh.jpg");
        Anime anime8 = new Anime("Boruto", "Uzumaki Boruto, filho de Uzumaki Naruto, o Sétimo Hokage, se inscreveu na Academia Ninja para aprender a ser um verdadeiro ninja. Os outros estudantes o ignoram por ser \"apenas o filho do Hokage\", mas a paixão e a personalidade do Boruto vai acabar com todos esses preconceitos. Quando uma série de misteriosos eventos começa a se desenrolar, cabe a Boruto e seus novos amigos a investigá-los. Como um tornado, Boruto entra no coração de todos: sua história está prestes a começar!", 2016, 12, "Boruto.jpg");
        Anime anime10 = new Anime("Demon Slayer", "Japão, era Taisho. Tanjiro, um bondoso jovem que ganha a vida vendendo carvão, descobre que sua família foi massacrada por um demônio. E pra piorar, Nezuko, sua irmã mais nova e única sobrevivente, também foi transformada num demônio. Arrasado com esta sombria realidade, Tanjiro decide se tornar um matador de demônios para fazer sua irmã voltar a ser humana, e para matar o demônio que matou sua família. Um triste conto sobre dois irmãos, onde os destinos dos humanos e dos demônios se entrelaçam, começa agora", 2021, 14, "DemonSlayer.jpg");
        Anime anime11 = new Anime("Fairy Tail", "Finalmente! O anime baseado no mangá de sucesso está de volta! Depois de um hiato de um ano, Fairy Tail está finalmente de volta, continuando de onde a primeira série parou. Seguindo as aventuras de Natsu Dragneel, Lucy Heartfilia e o resto de seus amigos, a série vai direto ao ápice dos Grandes Jogos Mágicos.", 2006, 14, "FairyTail.jpg");
        Anime anime12 = new Anime("Hunter X Hunter", "Monstros amedrontadores, criaturas exóticas, riquezas vastas, tesouros misteriosos, terras vis e terras inexploradas... Gon parte em uma aventura para se tornar um caçador profissional que arrisca a própria vida em busca do desconhecido. Pelo caminho, ele conhece outros participantes da Prova dos Caçadores: Kurapika, Leorio e Killua. Será Gon capaz de vencer os grandes desafios da Prova de Caçadores e se tornar o melhor do mundo? Esta jornada selvagem e épica está prestes a começar!", 1998, 14, "HunterXHunter.jpg");
        Anime anime13 = new Anime("Jujutsu Kaisen", "Sofrimento, arrependimento, vergonha: os sentimentos negativos dos humanos tornam-se Maldições, causando terríveis acidentes que podem levar até mesmo à morte. E pra piorar, Maldições só podem ser exorcizadas por outras Maldições. Certo dia, para salvar amigos que estavam sendo atacados por Maldições, Yuji Itadori engole o dedo do Ryomen-Sukuna, absorvendo sua Maldição. Ele então decide se matricular no Colégio Técnico de Feitiçaria de Tóquio, uma organização que combate as Maldições...", 2017, 16, "JujutsuKaisen.jpg");
        Anime anime14 = new Anime("My Hero Academy", "Por toda a sua vida, Izuku sonhou ser um heroi — um objetivo ambicioso para qualquer um, mas especialmente desafiador para um garoto sem superpoderes. Isso mesmo: em um mundo onde 80% da população tem algum tipo de Dom especial, Izuku teve a má sorte de nascer completamente normal. Mas isso não vai impedi-lo de se matricular em uma das academias de herois mais prestigiosas do mundo.", 2014, 12, "MyHeroAcademy.jpg");
        Anime anime15 = new Anime("Attack on Titan", "Por medo dos titãs, gigantes cruéis devoradores de pessoas, a humanidade vive atrás de muros. Eren Yeager e o amigo de Armin se juntam aos Survey Corps para enfrentá-los.", 2015, 16, "AttackOnTitan.jpg");
        Anime anime16 = new Anime("Sword Art Online", "Em 2022, a humanidade transformou as dimensões virtuais em realidade. Kirito é um dos jogadores do VRMMORPG 'Sword Art Online'", 2018, 16, "SwordArtOnline.jpg");
        Anime anime17 = new Anime("Overlord", "Um homem decide não deslogar quando um VRMMORPG antigo é fechado e como consequência ele é transportado para o jogo. Com apenas ele ali e sem uma família para se preocupar ele começa a tentar dominar o mundo do jogo, aonde os NPCs estão mudando pouco a pouco e começando a sentir emoções humanas.", 2010, 16, "Overlord.jpg");
        Anime anime18 = new Anime("Naruto", "Guiado pelo espírito demoníaco dentro dele, o órfão Naruto aprende a controlar seus poderes como um ninja nesta série de aventura anime", 2006, 10, "Naruto.jpg");
        
        anime10.setIndex(1);
        anime11.setIndex(1);
        anime12.setIndex(1);
        anime13.setIndex(1);
        anime14.setIndex(1);
        anime15.setIndex(1);
        anime16.setIndex(1);
        anime17.setIndex(1);
        anime18.setIndex(1);
        
        PlayList playList1 = new PlayList("One Piece", "Trilha Sonora", "https://open.spotify.com/embed/playlist/0Swm7O2RP11XNRUDYKkAJU");
        anime9.addPlayList(playList1);
        
        
        Season temporada1 = new Season("East Blue", "Jornada pelo East Blue", 1);
        Season temporada2 = new Season("Baroque Works", "Mugiwaras contra a Baroque Works", 2);
        Season temporada3 = new Season("Skypiea", "Mugiwaras contra a Baroque Works", 3);
        Episode episodio1 = new Episode("Eu sou Luffy! O homen que vai ser o Rei dos Piratas", "O jovem Luffy se perde dos outros piratas durante a invasão à um cruzeiro. Ainda bem que ele tem o poder da borracha.", 1, 1440, "https://api.animesgratisbr.com/video/8685");
        Episode episodio2 = new Episode("O grande espadachim aparece! Caçador de Piratas, Roronoa Zoro.", "Coby e Luffy chegam à cidade para recrutar Zoro. Por cima de um muro, eles veem uma garota e um homem aboradarem o caçador de recompensas que tinha sido capturado.", 2, 1440, "https://api.animesgratisbr.com/video/8701");
        Episode episodio3 = new Episode("Morgan VS Luffy! Quem é aquela linda misteriosa?", "Zoro e Luffy trabalham lado a lado para derrotar Morgan. Apesar de sua relação com Luffy e Zoro, Coby quer se juntar aos fuzileiros navais.", 3, 1440, "https://api.animesgratisbr.com/video/8703");
        Episode episodio4 = new Episode("O Passado de Luffy! Shanks, O Ruivo Aparece!", "Depois de testemunhar Shanks se posicionar contra o líder dos bandidos Higuma, o jovem Luffy jura que um dia se tornará o rei dos piratas.", 4, 1440, "https://api.animesgratisbr.com/video/8700");
        Episode episodio5 = new Episode("Medo, Poder Misterioso! Palhaço-Pirata, Capitão Buggy!", "Sem querer, Luffy acaba salvando Nami dos homens que a perseguiam. Quando ela apresenta Luffy para Buggy, ele manda que ela atire nele com o canhão.", 5, 1440, "https://api.animesgratisbr.com/video/8699");
        Episode episodio6 = new Episode("Situação Desesperadora! O Domador de Feras Mohji vs. Luffy!", "Mohji, o Domador de Feras e imediato de Buggy, ataca Luffy a mando de seu capitão!", 6, 1440, "https://api.animesgratisbr.com/video/8691");
        Episode episodio7 = new Episode("Grande Duelo! Zoro, o Espadachim vs. Cabaji, o Acrobata!", "Zoro enfrenta Cabaji, o Acrobata, enquanto Luffy enfrenta Buggy e Nami procura o mapa para a Grand Line!", 7, 1440, "https://api.animesgratisbr.com/video/8702");
        
        
        temporada1.addEpisodio(episodio1);
        temporada1.addEpisodio(episodio2);
        temporada1.addEpisodio(episodio3);
        temporada1.addEpisodio(episodio4);
        temporada1.addEpisodio(episodio5);
        temporada1.addEpisodio(episodio6);
        temporada1.addEpisodio(episodio7);
        anime9.addTemporada(temporada1);
        anime9.addTemporada(temporada2);
        anime9.addTemporada(temporada3);
        
        addAnime(anime1, anime2, anime3, anime4, anime5, anime6, anime7, anime8, anime9,
                 anime10, anime11, anime12, anime13, anime14, anime15, anime16, anime17, anime18);
    }
}
