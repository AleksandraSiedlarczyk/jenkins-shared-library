def getGitCommit(gitPath) {
  return "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}