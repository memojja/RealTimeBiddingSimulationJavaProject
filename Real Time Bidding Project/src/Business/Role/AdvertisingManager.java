/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdvertiserOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdvertiserRole.AdvertiserWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author anirudhbedre
 */
public class AdvertisingManager  extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,Network network, Ecosystem business) {
        return 
           new AdvertiserWorkAreaJPanel(userProcessContainer, enterprise,(AdvertiserOrganization)organization, account);
    }
}
