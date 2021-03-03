package aula07;

public class ex2 {
	public static void main(String[] args) {
		
        Equipa equipa1 = new Equipa("FC Porto","João Beterrabas");
        Equipa equipa2 = new Equipa("SL Benfica","António Albuquerque");
        
        Robô robo1_1 = new Robô(0, 30, "Bot1_1", "Defesa");
        Robô robo1_2 = new Robô(10, 10, "Bot1_2", "Médio");
        Robô robo1_3 = new Robô(40, 50, "Bot1_3" , "Avançado");
        equipa1.addRobô(robo1_1);
        equipa1.addRobô(robo1_2);
        equipa1.addRobô(robo1_3);
        
        Robô robo2_1 = new Robô(15, 60, "Bot2_1", "Guarda Redes");
        Robô robo2_2 = new Robô(70, 10, "Bot2_2", "Médio");
        Robô robo2_3 = new Robô(45, 20, "Bot2_3", "Avançado");
        equipa2.addRobô(robo2_1);
        equipa2.addRobô(robo2_2);
        equipa2.addRobô(robo2_3);
        
        Bola bola = new Bola(50, 50, "Laranja");
        Jogo jogo = new Jogo(bola, equipa1, equipa2);
        jogo.apresentação();
        
        jogo.start();
        
        robo1_1.move(10, 40);
        bola.move(10, 40);
        robo1_2.move(42, 24);
        robo1_3.move(0, 5);
        robo2_1.move(60, 10);
        robo2_2.move(-12, 55);
        robo2_3.move(10, -30);
        
        robo1_1.marcarGolo();
        equipa1.marcarGolo();
        equipa2.sofrerGolo();
        jogo.goloEquipa1();
       
        System.out.println(jogo);
        
        robo1_2.move(40, 3);
        robo1_3.move(50, 20);
        bola.move(10, 20);
        robo2_1.move(20, 10);
        
        robo1_3.marcarGolo();
        equipa1.marcarGolo();
        equipa2.sofrerGolo();
        jogo.goloEquipa1();
        
        System.out.println(jogo);
        
        robo2_1.move(5, 10);
        robo1_2.move(33, -21);
        robo2_3.move(50, 44);
        bola.move(11, 11);
        
        robo2_3.marcarGolo();
        equipa2.marcarGolo();
        equipa1.sofrerGolo();
        jogo.goloEquipa2();
        
        System.out.println(jogo);
        
        jogo.end();
        
        

        
    }
}
