
package Administrador.horarios;



public class CreacionMateria {
   
    Object ObjMateria = new Object();
    
    public String  etica = "etica";
    public String  programacion2="Programacion 2";
    public String programacion1="Programacion 1";
    public String precalculo ="Precalculo" ;
    public String ccna="CCNA";
    public String calculo="Calculo";
    public String psicologia="Psicologia";
    public String contabilidad="Contabilidad";
    public String analisis="Analisis";
    public String bitmap="Bitmap";
    public String dataBase="Base De Datos";
    public int creditos;
    public String aula="";
    public String Dias="";
    

    public CreacionMateria (String etica, String programacion2, String programacion1, String precalculo, String
            ccna, String calculo, String psicologia, String contabilidad, String analisis, String bitmap , int creditos
            ,String aula, String dias, String dataBase){
    
        this.Dias=dias;
        this.analisis=analisis;
        this.aula=aula;
        this.bitmap=bitmap;
        this.calculo=calculo;
        this.ccna=ccna;
        this.contabilidad=contabilidad;
        this.creditos=creditos;
        this.etica=etica;
        this.precalculo=precalculo;
        this.programacion1=programacion1;
        this.programacion2=programacion2;
        this.psicologia=psicologia;
        
    }

    CreacionMateria(String etica, String programacion2, String programacion1, String precalculo, String ccna, String calculo, String psicologia, String contabilidad, String analisis, String bitmap, int creditos, String aula, String Dias) {
        
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String Dias) {
        this.Dias = Dias;
    }

    public String getAnalisis() {
        return analisis;
    }

    public void setAnalisis(String analisis) {
        this.analisis = analisis;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getBitmap() {
        return bitmap;
    }

    public void setBitmap(String bitmap) {
        this.bitmap = bitmap;
    }

    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    public String getCcna() {
        return ccna;
    }

    public void setCcna(String ccna) {
        this.ccna = ccna;
    }

    public String getContabilidad() {
        return contabilidad;
    }

    public void setContabilidad(String contabilidad) {
        this.contabilidad = contabilidad;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getEtica() {
        return etica;
    }

    public void setEtica(String etica) {
        this.etica = etica;
    }

    public String getPrecalculo() {
        return precalculo;
    }

    public void setPrecalculo(String precalculo) {
        this.precalculo = precalculo;
    }

    public String getProgramacion1() {
        return programacion1;
    }

    public void setProgramacion1(String programacion1) {
        this.programacion1 = programacion1;
    }

    public String getProgramacion2() {
        return programacion2;
    }

    public void setProgramacion2(String programacion2) {
        this.programacion2 = programacion2;
    }

    public String getPsicologia() {
        return psicologia;
    }

    public void setPsicologia(String psicologia) {
        this.psicologia = psicologia;
    }
    public String getDatabase() {
        return dataBase;
    }
    
    public void setDatabase(String dataBase) {
        this.dataBase = dataBase;
    }

}