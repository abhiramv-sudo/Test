procedure 'SyncTest', {
  projectName = 'IRT-Utilities'
  resourceName = 'cdrocxagent1'
  timeLimit = '0'

  step 'TestSync', {
    command = 'echo "TestWebHook123"'
    procedureName = 'SyncTest'
    timeLimit = '0'
    timeLimitUnits = 'seconds'
  }
}
