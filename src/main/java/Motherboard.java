/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class Motherboard extends ComputerComponents{
    
    private String  socket;

    public Motherboard(String type, String series, String  socket) {
        super(type, series);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
    
    
    
    
}
