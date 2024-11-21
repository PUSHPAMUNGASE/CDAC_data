import React from "react";
import Child2 from "../components/Child2";
import ErrorBoundary from "../ErrorBoundary";

export default function Parent2() {
  return (
    <div className="container">
      <h1>Error Boundry</h1>
      <div className="row">
        <div className="col-4">
          <Child2 p1="https://cdn0.iconfinder.com/data/icons/find-a-job-and-interview-flat/512/employee_person_man_business_office_businessman_people_male_worker-64.png" />
        </div>
        <div className="col-4">
          <Child2 p1="https://cdn0.iconfinder.com/data/icons/find-a-job-and-interview-flat/512/phone_business_interview_manager_job_communication_conversation_work_people-64.png" />
        </div>
        <div className="col-4">
          <ErrorBoundary>
            <Child2 p1="" />
          </ErrorBoundary>
        </div>
      </div>
    </div>
  );
}
