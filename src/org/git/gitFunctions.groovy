package org.git;

def getGitCommit(gitPath) {
    return "usr/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}