procedure 'SyncTest', {
  projectName = 'IRT-Utilities'
  resourceName = 'cdrocxagent1'
  timeLimit = '0'

  step 'TestSync', {
    command = 'echo "Hello World 1234556744444"'
    procedureName = 'SyncTest'
    timeLimit = '0'
    timeLimitUnits = 'seconds'
  }
}
