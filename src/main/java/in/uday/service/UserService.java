package in.uday.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.uday.entity.Role;
import in.uday.entity.User;
import in.uday.repo.RoleRepo;
import in.uday.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo urepo;
	@Autowired
	private RoleRepo rrepo;
	public void savedata() {
		User u=new User();
		u.setName("uday");
		u.setPhno(9966558100l);
		
		
		Role r=new Role();
		r.setRole("manager");
		
		
		Role r1=new Role();
		r1.setRole("admin");
		u.setRoles(Arrays.asList(r,r1));
		urepo.save(u);
		
		
		
		
	}

}
