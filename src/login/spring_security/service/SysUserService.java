package login.spring_security.service;

import login.spring_security.dao.SysUserDAO;
import login.spring_security.model.AcSysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysUserService {
	
	@Autowired
	SysUserDAO sysUserDAO;
	public List<AcSysUser> findUsers(AcSysUser user) {
		return sysUserDAO.findUsers(user);
	}

}
