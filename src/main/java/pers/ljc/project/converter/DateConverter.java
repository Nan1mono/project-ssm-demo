package pers.ljc.project.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 戴着假发的程序
 */
@Component
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
        } catch (ParseException e) {
//            e.printStackTrace();
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(s);
            } catch (ParseException ex) {
//                ex.printStackTrace();
            }
        }
        return null;
    }
}
