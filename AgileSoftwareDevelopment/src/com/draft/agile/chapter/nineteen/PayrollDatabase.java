package com.draft.agile.chapter.nineteen;

import com.draft.agile.chapter.nineteen.transaction.Employee;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PayrollDatabase {
    private static Map<Integer, Employee> itsEmployees = new ConcurrentHashMap<>();
    private static Map<Integer, Employee> itsMembers = new ConcurrentHashMap<>();

    public static void addUnionMember(int memberId, Employee employee){
        itsMembers.put(memberId, employee);
    }

    public static Employee getUnionMember(int memberId) {
        return itsMembers.get(memberId);
    }


    public static Employee getEmployee(int empId){
        return itsEmployees.get(empId);
    }

    public static void addEmployee(int empId, Employee employee){
        itsEmployees.put(empId, employee);
    }

    public static void clear() {
        itsEmployees.clear();
    }

    public static void deleteEmployee(int empId) {
        itsEmployees.remove(empId);
    }
}
