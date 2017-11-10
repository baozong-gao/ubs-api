package models;

import play.db.jpa.GenericModel;
import play.db.jpa.JPA;
import util.jpaUtil.BaseDaoImpl;
import util.jpaUtil.Query;

import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 查询基类
 * @Date: Created in 2017/11/10 - 10:09
 * @Version: V1.0
 */
public class BaseModel<D> extends GenericModel {

    public List<BaseModel> findByDTO(D dto) throws Exception {
        BaseDaoImpl baseDao = new BaseDaoImpl<BaseModel>();
        baseDao.setEntityManager(JPA.em());
        util.jpaUtil.Query query = Query.forClass(getClass(), JPA.em());
        query.build(dto);
        return baseDao.query(query);
    }
}
