package cn.edu.jit.dto;

import cn.edu.jit.entry.User;

/**
 * @author jitwxs
 * @date 2018/1/8 22:23
 */
public class UserDto extends User {
    private String areaName;

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
