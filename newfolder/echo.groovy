procedure 'echo', {
  projectName = 'IRT Promotion'
  resourceName = 'cbcdroagent-flow-agent-0'
  timeLimit = '0'

  step 'echo', {
    command = 'echo "Hello"'
    timeLimit = '0'
    timeLimitUnits = 'seconds'
  }
}
