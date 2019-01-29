package com.douzone.mysite.action.board;

import com.douzone.mvc.action.AbstractActionFactory;
import com.douzone.mvc.action.Action;
import com.douzone.mysite.action.main.IndexAction;

public class BoardActionFactory extends AbstractActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action=null;
		
		if("list".equals(actionName)) {
			action=new BoardFormAction();
		}else if("write".equals(actionName)) {
			action=new WriteFormAction();
		}else if("view".equals(actionName)) {
			action=new ViewFormAction();
		}else if("modify".equals(actionName)) {
			action=new ModifyFormAction();
		}else if("writing".equals(actionName)) {
			action=new WritingAction();
		}else if("boardselect".equals(actionName)) {
			action=new SelectBoardListAction();
		}else if("modifyAction".equals(actionName)) {
			action=new ModifyAction();
		}else if("delete".equals(actionName)) {
			action=new DeleteAction();
		}else if("replyForm".equals(actionName)) {
			action=new ReplyFormAction();
		}else if("reply".equals(actionName)) {
			action=new ReplyAction();
		}else {
			action=new IndexAction();
		}
		
		return action;
	}

}
