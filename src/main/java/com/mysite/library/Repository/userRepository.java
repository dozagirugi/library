package com.mysite.library.Repository;

import com.mysite.library.User.userInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userInfo, Long> {
}
