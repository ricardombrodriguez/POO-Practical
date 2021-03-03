package aula07;

public class ex2 {
	public static void main(String[] args) {
		
        Equipa equipa1 = new Equipa("FC Porto","Jo�o Beterrabas");
        Equipa equipa2 = new Equipa("SL Benfica","Ant�nio Albuquerque");
        
        Rob� robo1_1 = new Rob�(0, 30, "Bot1_1", "Defesa");
        Rob� robo1_2 = new Rob�(10, 10, "Bot1_2", "M�dio");
        Rob� robo1_3 = new Rob�(40, 50, "Bot1_3" , "Avan�ado");
        equipa1.addRob�(robo1_1);
        equipa1.addRob�(robo1_2);
        equipa1.addRob�(robo1_3);
        
        Rob� robo2_1 = new Rob�(15, 60, "Bot2_1", "Guarda Redes");
        Rob� robo2_2 = new Rob�(70, 10, "Bot2_2", "M�dio");
        Rob� robo2_3 = new Rob�(45, 20, "Bot2_3", "Avan�ado");
        equipa2.addRob�(robo2_1);
        equipa2.addRob�(robo2_2);
        equipa2.addRob�(robo2_3);
        
        Bola bola = new Bola(50, 50, "Laranja");
        Jogo jogo = new Jogo(bola, equipa1, equipa2);
        jogo.apresenta��o();
        
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
