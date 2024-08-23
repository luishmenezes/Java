public class Carro{
    String montadora;
    String modelo;
    int ano;
    Boolean estaLigado;
    double velocidade;

    Carro(String montadora, String modelo, int ano){
        this.montadora = montadora;
        this.modelo = modelo;
        this.ano = ano;
        this.estaLigado = false;
        this.velocidade = 0;
    }

    Carro(){
        this.estaLigado = false;
        this.velocidade = 0;

    };

    void ligar(){
        this.estaLigado = true;
        System.out.println("O carro está ligado !");
    };

    void desligar(){
        this.estaLigado = false;
        System.out.println("O carro foi desligado !");
    }

    void buzinar(){
        System.out.println("BEEEEP BEEEEP BEEEEEP");
    }
    
    void acelerar(){
        this.velocidade +=20;
        
        System.out.println("A velocidade atual é: " + velocidade);
        
    }

    void frear(){
        if(this.velocidade < 30){
            velocidade = 0;
        } else {
            this.velocidade -= 30;
        };
        System.out.println("A velocidade atual é: " + velocidade);
        }
        
    }

