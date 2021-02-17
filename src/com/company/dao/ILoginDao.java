package com.company.dao;

import com.company.Entiry.LoginData;

/**
 * The interface Login dao.
 */
public interface ILoginDao {
    /**
     * Authenticate boolean.
     *
     * @param loginData the login data
     * @return the boolean
     */
    public boolean authenticate(LoginData loginData);
}
