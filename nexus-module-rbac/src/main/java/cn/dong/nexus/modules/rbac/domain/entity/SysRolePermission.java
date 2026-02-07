package cn.dong.nexus.modules.rbac.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class SysRolePermission {

    private String roleId;

    private String permissionId;
}
