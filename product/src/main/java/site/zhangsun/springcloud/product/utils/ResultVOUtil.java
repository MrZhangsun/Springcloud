package site.zhangsun.springcloud.product.utils;

import site.zhangsun.springcloud.product.pojo.vo.ResultVO;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:43
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}

