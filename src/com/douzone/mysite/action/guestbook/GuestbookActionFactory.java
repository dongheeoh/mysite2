package com.douzone.mysite.action.guestbook;

import com.douzone.mvc.action.AbstractActionFactory;
import com.douzone.mvc.action.Action;
import com.douzone.mysite.action.main.IndexAction;

public class GuestbookActionFactory extends AbstractActionFactory {

	@Override
	public Action getAction(String actionName) {
		
		Action action=null;
		
		if("insert".equals(actionName)) {
			action=new InsertAction();
		}else if("delete".equals(actionName)) {
			action=new DeleteAction();
		}else if("list".equals(actionName)) {
			action=new GuestBookFormAction();
		}else if("deleteform".equals(actionName)) {
			action=new DeleteFormAction();
		}else if("select".equals(actionName)) {
			action=new SelectListAction();
		}else if("ajax".equals(actionName)) {
			action=new AjaxAction();
		}
		else {
			action=new IndexAction();
		}
		
		return action;
	}

}
