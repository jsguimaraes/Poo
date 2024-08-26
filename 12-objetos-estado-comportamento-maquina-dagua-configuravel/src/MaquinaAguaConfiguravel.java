class MaquinaAguaConfiguravel {

    //constantes
    final int capacidadeAgua;
    final int capacidadeCopos200;
    final int capacidadeCopos300;

    //variaveis
    private int copos200;
    private int copos300;
    private int agua;

    MaquinaAguaConfiguravel(int capacidadeAgua, int capacidadeCopos200, int capacidadeCopos300) {
        this.capacidadeAgua = capacidadeAgua;
        this.capacidadeCopos200 = capacidadeCopos200;
        this.capacidadeCopos300 = capacidadeCopos300;
    }
    
    int agua() {
        return agua;
    }

    int copos200() {
        return copos200;
    }


	int copos300() {
		return copos300;
	}

    void abastecerAgua() {
        if(agua < capacidadeAgua){
            agua = capacidadeAgua;
        }
    }

    void abastecerCopo200() {
        if(copos200 < capacidadeCopos200){
            copos200 = capacidadeCopos200;
        }
    }

    void abastecerCopo300() {
        if(copos300 < capacidadeCopos300){
            copos300 = capacidadeCopos300;
        }
    }

    void servirCopo200() {
        if(agua > 0 && copos200 > 0){
            copos200--;
            agua-=200;
        }
    }





}
