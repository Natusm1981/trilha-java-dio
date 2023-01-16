public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("A TV está ligada!");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A TV está DESligada!");
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume da TV para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo volume da TV para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal da TV para: " + canal);
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("Canal da TV para: " + canal);
    }

    public void diminuirCanal(){
        canal --;
        System.out.println("Canal da TV para: " + canal);
    }
    

}
