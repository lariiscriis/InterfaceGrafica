package br.edu.fatecpg.gui.model;

public class PreferenciasUsuario {
    private String tema;
    private boolean notificacao;
    private int volume;
   
    public PreferenciasUsuario(String tema, boolean notificacao, int volume) {
        this.tema = tema;
        this.notificacao = notificacao;
        this.volume = volume;
    }
   
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
   
    public boolean getNotificacao() {
        return notificacao;
    }
    public void setNotificacao(boolean notificacao) {
        this.notificacao = notificacao;
    }
   
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String preferencias(){
        return "Tema: "+ getTema() + "\n Notificação: "+ getNotificacao() + "\n Volume: "+ getVolume();
     }
   
}