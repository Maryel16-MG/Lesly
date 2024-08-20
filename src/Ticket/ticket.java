/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

/**
 *
 * @author Student
 */
public class ticket {
    private int NumeroTicket;
    private String Tipo;

    public int getNumeroTicket() {
        return NumeroTicket;
    }

    public String getTipo() {
        return Tipo;
    }

    public ticket(int NumeroTicket, String Tipo) {
        this.NumeroTicket = NumeroTicket;
        this.Tipo = Tipo;
    }

    public ticket() {
        this(0,"");
    }

    @Override
    public String toString() {
        return "ticket{" + "NumeroTicket=" + NumeroTicket + ", Tipo=" + Tipo + '}';
    }
    
    
    
}
