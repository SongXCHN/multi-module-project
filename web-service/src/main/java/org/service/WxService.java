package org.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by SongX on 2017/9/12.
 */
@Service
public class WxService {

    private static Logger logger = LoggerFactory.getLogger(WxService.class);

    public void cc() {
        String num = "12";
        try {
            int n = Integer.valueOf(num);
            logger.info("logger info!!!, n = {}", n);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);

        }

    }
}
