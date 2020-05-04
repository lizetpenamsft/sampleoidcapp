package com.ernani.oidc;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// import com.ibm.websphere.security.cred.WSCredential;

public class AuthServletInfo extends HttpServlet {

    public AuthServletInfo() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.getWriter().write("All good!");

        /*
        Subject subject = com.ibm.websphere.security.auth.WSSubject.getCallerSubject();

        if (subject != null) {

            WSCredential cred = (WSCredential) subject.getPublicCredentials(WSCredential.clas).iterator().next();

            if (cred != null) {
                res.write(" Realm:" + cred.getRealmName() + "<br>");
            }
        }
        */
    }
}