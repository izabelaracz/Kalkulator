package com.service;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.IOException;
import java.util.Optional;

public class MyTestWatcher implements TestWatcher {
    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable) {
        // do something
    }

    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional) {
        // do something
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable) {
        String command = "powershell.exe \"C:\\Users\\izabe\\OneDrive\\Pulpit\\test_failed.ps1\"";
        Process powerShellProcess = null;
        try {
            powerShellProcess = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            powerShellProcess.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        String command = "powershell.exe \"C:\\Users\\izabe\\OneDrive\\Pulpit\\test_passed.ps1\"";
        Process powerShellProcess = null;
        try {
            powerShellProcess = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            powerShellProcess.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
