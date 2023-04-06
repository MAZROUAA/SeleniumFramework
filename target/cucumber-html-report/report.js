$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("userReg.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": "I want to check that user can register in our e-commerce website.",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered the \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cemail\u003e\" , \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the registration page displayed successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "pass"
      ],
      "line": 10,
      "id": "user-registration;user-registration;;1"
    },
    {
      "cells": [
        "mohamed",
        "ahmed",
        "mmmm@gmail.com",
        "1111111"
      ],
      "line": 11,
      "id": "user-registration;user-registration;;2"
    },
    {
      "cells": [
        "ggsjd",
        "ffdjjf",
        "hhhh@gmail.com",
        "12333333"
      ],
      "line": 12,
      "id": "user-registration;user-registration;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered the \"mohamed\" , \"ahmed\" , \"mmmm@gmail.com\" , \"1111111\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegForBDD.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 228857300,
  "error_message": "java.lang.ExceptionInInitializerError\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:578)\r\n\tat org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:677)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)\r\n\tat org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)\r\n\tat org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)\r\n\tat org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)\r\n\tat org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:829)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:437)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:431)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:391)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:330)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1176)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1099)\r\n\tat org.testng.TestNG.run(TestNG.java:1067)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n\tat ✽.Given the user in the home page(userReg.feature:5)\r\nCaused by: java.lang.reflect.InaccessibleObjectException: Unable to make field private final java.util.Comparator java.util.TreeMap.comparator accessible: module java.base does not \"opens java.util\" to unnamed module @77b52d12\r\n\tat java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)\r\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)\r\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)\r\n\tat java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)\r\n\tat java.base/java.lang.reflect.Field.setAccessible(Field.java:174)\r\n\tat cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)\r\n\tat cucumber.deps.com.thoughtworks.xstream.converters.collections.TreeMapConverter.\u003cclinit\u003e(TreeMapConverter.java:50)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:578)\r\n\tat org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:677)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)\r\n\tat org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)\r\n\tat org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)\r\n\tat org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)\r\n\tat org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:829)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:437)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:431)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:391)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:330)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1176)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1099)\r\n\tat org.testng.TestNG.run(TestNG.java:1067)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserRegForBDD.i_click_on_register_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "mohamed",
      "offset": 15
    },
    {
      "val": "ahmed",
      "offset": 27
    },
    {
      "val": "mmmm@gmail.com",
      "offset": 37
    },
    {
      "val": "1111111",
      "offset": 56
    }
  ],
  "location": "UserRegForBDD.i_entered_the(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserRegForBDD.the_registration_page_displayed_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered the \"ggsjd\" , \"ffdjjf\" , \"hhhh@gmail.com\" , \"12333333\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegForBDD.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 671100,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.collections.TreeMapConverter\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:578)\r\n\tat org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:677)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)\r\n\tat org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)\r\n\tat org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)\r\n\tat org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)\r\n\tat org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:829)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:437)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:431)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:391)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:330)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1176)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1099)\r\n\tat org.testng.TestNG.run(TestNG.java:1067)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n\tat ✽.Given the user in the home page(userReg.feature:5)\r\nCaused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field private final java.util.Comparator java.util.TreeMap.comparator accessible: module java.base does not \"opens java.util\" to unnamed module @77b52d12 [in thread \"main\"]\r\n\tat java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)\r\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)\r\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)\r\n\tat java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)\r\n\tat java.base/java.lang.reflect.Field.setAccessible(Field.java:174)\r\n\tat cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)\r\n\tat cucumber.deps.com.thoughtworks.xstream.converters.collections.TreeMapConverter.\u003cclinit\u003e(TreeMapConverter.java:50)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:578)\r\n\tat org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:677)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)\r\n\tat org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)\r\n\tat org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)\r\n\tat org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)\r\n\tat org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:829)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:437)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:431)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:391)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:330)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1176)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1099)\r\n\tat org.testng.TestNG.run(TestNG.java:1067)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserRegForBDD.i_click_on_register_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ggsjd",
      "offset": 15
    },
    {
      "val": "ffdjjf",
      "offset": 25
    },
    {
      "val": "hhhh@gmail.com",
      "offset": 36
    },
    {
      "val": "12333333",
      "offset": 55
    }
  ],
  "location": "UserRegForBDD.i_entered_the(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserRegForBDD.the_registration_page_displayed_successfully()"
});
formatter.result({
  "status": "skipped"
});
});