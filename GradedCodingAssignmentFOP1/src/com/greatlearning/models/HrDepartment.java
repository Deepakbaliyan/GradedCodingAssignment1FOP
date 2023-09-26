package com.greatlearning.models;

public class HrDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity(String activity) {
        return activity;
    }
}

