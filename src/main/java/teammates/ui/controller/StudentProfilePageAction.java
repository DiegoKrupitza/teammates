/**
 * 
 */
package teammates.ui.controller;

import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.util.Const;
import teammates.logic.api.GateKeeper;

public class StudentProfilePageAction extends Action {

    private PageData data;
    
    public StudentProfilePageAction() {
        // TODO Auto-generated constructor stub
    }

    @Override
    protected ActionResult execute() throws EntityDoesNotExistException {
        new GateKeeper().verifyLoggedInUserPrivileges();
        
        data = new PageData(this.account);
        
        ShowPageResult response = createShowPageResult(Const.ViewURIs.STUDENT_PROFILE_PAGE, data);
        
        return response;
    }
}
