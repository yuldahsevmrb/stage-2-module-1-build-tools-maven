package com.epam.demo;






import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}