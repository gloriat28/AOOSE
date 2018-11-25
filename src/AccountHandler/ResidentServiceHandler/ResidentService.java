/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler.ResidentServiceHandler;

import AccountHandler.PublicRelationHandler.PublicRelation;
import AccountHandler.Staff;
import java.rmi.RemoteException;
import java.sql.Time;

/**
 *
 * @author glori
 */
public class ResidentService extends Staff implements ResidentServiceInt,ResidentServiceObserver{

    public ResidentService() throws RemoteException {
    }

    public ResidentService(String name, int SSN, String dateOfBirth, String username, String password) throws RemoteException {
        super(name, SSN, dateOfBirth, username, password);
    }

    public ResidentService(Time checkInTime, Time checkOutTime, float salary, String name, int SSN, String dateOfBirth, String username, String password) throws RemoteException {
        super(checkInTime, checkOutTime, salary, name, SSN, dateOfBirth, username, password);
    }
    
    
    @Override
    public void getNewComplaintNotification(String m){
        
    }
    @Override
    public void getNewRequestNotification(String m){
        
    }
    @Override
    public void contactPublicRelation(PublicRelation pr){
        
    }
}
