/**
 * Copyright 2014-2019  the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.webank.webase.sign.api.dao;


import com.webank.webase.sign.pojo.po.UserInfoPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * user repository.
 */
@Repository
public interface UserDao {

    void createTbUser();

    void insertUserInfo(UserInfoPo userInfoPo);

    UserInfoPo findUser(@Param("address") String address);

    void updateRequestCount(@Param("id") Long id, @Param("requestCount") int requestCount);

    void updateHandleStatus(UserInfoPo userInfoPo);
}
