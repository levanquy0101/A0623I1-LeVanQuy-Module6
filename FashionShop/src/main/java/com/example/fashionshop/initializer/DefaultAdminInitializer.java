package com.example.fashionshop.initializer;

import com.example.fashionshop.entity.Role;
import com.example.fashionshop.entity.User;
import com.example.fashionshop.services.IRoleService;
import com.example.fashionshop.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class DefaultAdminInitializer implements CommandLineRunner {

    private final IUserService userService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    private  IRoleService roleService;

    public DefaultAdminInitializer(IUserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        // Kiểm tra xem đã có admin trong cơ sở dữ liệu chưa
        if (!userService.existsByUsername("admin")) {
            //Tìm kiếm trong DB có Role tên là ROLE_ADMIN không?
            Role adminRole = roleService.findByName("ROLE_ADMIN");
            if (adminRole == null) {
                // Nếu chưa có, tạo mới Role ROLE_ADMIN
                adminRole = new Role();
                adminRole.setName("ROLE_ADMIN");
//                adminRole.setLevel(1);
                roleService.save(adminRole);
            }
            // Tạo tài khoản admin mặc định
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("1234"));
            admin.setRole(adminRole);
            admin.setEnabled(true);
            userService.save(admin);
        }
    }
}
