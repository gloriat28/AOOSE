/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import AccountHandler.ResidentServiceHandler.ResidentServiceObserver;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author glori
 */
public class ComplaintFacade extends UnicastRemoteObject implements ComplaintInt {
    private Complaint complaint;

    public ComplaintFacade()throws RemoteException {
        complaint=new Complaint();
    }

    public ComplaintFacade(Complaint complaint)throws RemoteException {
        this.complaint = complaint;
    }
    
    @Override
    public void addNewComplaint(Complaint c)throws RemoteException{
        complaint.addNewComplaint(c);
    }
    
    @Override
    public Complaint viewComplaint()throws RemoteException{
        return complaint;
    }
    
    public void notifyAllResidentServices()throws RemoteException{
        complaint.notifyAllResidentServices();
    }
    
    public void addNewResidentService(ResidentServiceObserver r)throws RemoteException{
        complaint.addNewResidentService(r);
    }
    
    public void removeResidentService(String name)throws RemoteException{
        complaint.removeResidentService(name);
    }
    
    @Override
    public void deleteComplaint()throws RemoteException{
        complaint.deleteComplaint();
    }
    
    @Override
    public void setResidentInfo(String name,String phone,String add)throws RemoteException{
        complaint.setResidentName(name);
        complaint.setResidentPhone(phone);
        complaint.setResidentAddress(add);
    }
    
    public String getResidentInfo()throws RemoteException{
        return "Resident Name "+complaint.getResidentName()+"/nResident Phone "+complaint.getResidentPhone()+"/nResident Address "+complaint.getResidentAddress();
    }

}
