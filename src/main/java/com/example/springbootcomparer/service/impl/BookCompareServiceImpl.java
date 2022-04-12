package com.example.springbootcomparer.service.impl;

import com.example.springbootcomparer.domain.Book;
import com.example.springbootcomparer.domain.BookExt;
import com.example.springbootcomparer.service.BookCompareService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


/**
 * @author hongcunlin
 */
@Service
public class BookCompareServiceImpl implements BookCompareService {
    @Override
    public boolean compare(Book source, Book target) {
        if (source == null) {
            return target == null;
        } else {
            if (target == null) {
                return false;
            }
            return Objects.equals(source.getId(), target.getId()) &&
                    Objects.equals(source.getType(), target.getType()) &&
                    Objects.equals(source.getName(), target.getName()) &&
                    Objects.equals(source.getCreateTime(), target.getCreateTime()) &&
                    Objects.equals(source.getUpdateTime(), target.getUpdateTime()) &&
                    compareList(source.getBookExtList(), target.getBookExtList());
        }
    }

    /**
     * List类型不考虑顺序，比较是否一样
     *
     * @param source 源
     * @param target 目标
     * @return 是否一样
     */
    private boolean compareList(List<BookExt> source, List<BookExt> target) {
        // 2.非空判断
        if (source == null) {
            return target == null;
        } else {
            if (target == null) {
                return false;
            }
            // 2.元素个数判断
            if (source.size() != target.size()) {
                return false;
            }
            // 3.元素全部包含判断
            return source.containsAll(target);
        }
    }
}
