package com.example.springVlmProject.utils;

import lombok.SneakyThrows;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.util.Objects;

public class Utils {
    @SneakyThrows
    public static void copy(Object from, Object to) {
        Field[] fields = FieldUtils.getAllFields(from.getClass()); // получаем все поля первоначального объекта
        for (Field field : fields) {
            //считывается поле из переменной field, которое относится к объекту from, и делаем данное поле доступным
            Object o = FieldUtils.readField(field, from, true);
            if (Objects.nonNull(o)) {
                //объекту to назначается поле с имененм field.getName, и в него помещается значение из o
                FieldUtils.writeField(to, field.getName(), o, true);
            }
        }
    }
}
