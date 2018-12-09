/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilityHandler;

import AccountHandler.EmplyeeHandler.Employee;
import AccountHandler.ResidentHandler.Resident;
import DB.UtilityGateway;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author glori
 */
abstract public class UtilityFactoryInt extends UnicastRemoteObject implements UtilityFactoryRMI {

    public UtilityFactoryInt() throws RemoteException  {
    }

    
    //template method pattern
    @Override
    public UtilityIntRMI addNewUtility(String residentName, String residentPhone, String time, String day) throws RemoteException {
        try {
            Integer autoGeneratedID = UtilityGateway.UtilityID;
            //template method
            Employee availableEmployee = selectAvailableEmployee();
            //template method
            UtilityIntRMI utility = createUtility(autoGeneratedID, availableEmployee, residentName, residentPhone, time, day);

            return utility;

        } catch (Exception ex) {
            System.out.println("error occurred");
            return null;
        }
    }

//    @Override
//    public UtilityIntRMI addNewUtility(Resident residentIn, String time, String day) throws RemoteException {
//        try {
//            Integer autoGeneratedID = UtilityGateway.UtilityID;
//            //template method
//            Employee availableEmployee = selectAvailableEmployee();
//            //template method
//            UtilityIntRMI utility = createUtility(autoGeneratedID, availableEmployee, residentIn.getName(), residentIn.getPhone(), time, day);
//            
//            return utility;
//
//        } catch (Exception ex) {
//            System.out.println("error occurred");
//            return null;
//        }
//    }
    protected abstract UtilityInt createUtility(Integer utilityID, Employee employee, String residentName, String residentPhone, String time, String day) throws RemoteException;

    protected abstract Employee selectAvailableEmployee() throws RemoteException;

}