/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yage.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.yage.struts.form.UserForm;

/** 
 * MyEclipse Struts
 * Creation date: 09-07-2015
 * 
 * XDoclet definition:
 * @struts.action path="/register" name="userForm" scope="request"
 */
public class RegisterAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm userForm = (UserForm) form;// TODO Auto-generated method stub
		
		System.out.print("�û���"+userForm.getUsername()+"/����"+userForm.getPassword());
		
		if(userForm.getPassword().equals("123456"))
		{
			return mapping.findForward("ok");
		}else{
			request.setAttribute("errorInfo", "ע��ʧ�ܣ�������ע�ᣡ");
			return mapping.findForward("error");
		}
		
	}
}