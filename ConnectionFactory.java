
package com.mycompany.db;
public class ConnectionFactory {
   private String usuario = "root";
   private String senha = "usjt@2019";
   private String host = "localhost";
   private String porta = "3306";
   private String timezone = "America/Sao_Paulo";
   private String bd = "Aluno";
   
   public Connetion obtemConexao() {
       try{
           String url = "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?serverTimezone=" + timezone;
           Connection conectar = DriveManager.getConnetion(url, usuario ,senha);
           
       }
   }
}
