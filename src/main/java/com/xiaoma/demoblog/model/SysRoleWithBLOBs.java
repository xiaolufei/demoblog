package com.xiaoma.demoblog.model;

public class SysRoleWithBLOBs extends SysRole {
    private String modules;

    private String describe;

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules == null ? null : modules.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}