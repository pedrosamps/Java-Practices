package datas;


public class Datas {
    private int dia, mes, ano;

    public Datas(int dia, int mes, int ano) {
        setDia(dia); 
        setMes(mes);
        setAno(ano);
    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if (dia > 0 && dia <=31) {
            this.dia = dia;
        } else {
            this.dia = 0;
        }
        
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            mes = 0;
        }
        
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (ano > 0) {
           this.ano = ano; 
        }
        
    }

    public String  exibir() {
        return getDia() + "/" + getMes() + "/" + getAno();
    }
}
