package com.corning.drools.entity;

import lombok.extern.slf4j.Slf4j;
import org.drools.core.base.RuleNameStartsWithAgendaFilter;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class LhsTest extends DroolsBaseTest {

    @Before
    public void setUP() {
        super.setUP();

        final Student student1 = new Student();
        student1.setAge(1);
        student1.setName("student1");
        kieSession.insert(student1);

        final Student student2 = new Student();
        student2.setAge(2);
        student2.setName("student2");
        kieSession.insert(student2);
    }

    @Test
    public void lhs() {
        kieSession.fireAllRules(new RuleNameStartsWithAgendaFilter("rule_lhs_"));

        /*
        [main] INFO com.corning.drools.entity.DroolsBaseTest - Fri Oct 23 16:30:07 CST 2020 - kieSession init
        [main] INFO com.corning.drools.entity.DroolsBaseTest - rule_lhs_1 occur, $student=Student(id=0, name=student1, age=1)
        [main] INFO com.corning.drools.entity.DroolsBaseTest - rule_lhs_2 occur, $student=Student(id=0, name=student2, age=2)
        [main] INFO com.corning.drools.entity.DroolsBaseTest - Fri Oct 23 16:30:08 CST 2020 - kieSession dispose
         */

    }



}