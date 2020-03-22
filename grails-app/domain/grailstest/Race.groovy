package grailstest

class Race {
    String name
    Date startDate
    String city
    String state
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners = 100000
    static constraints = {
        name(email: true)
        city(inList: ["ktm","phk","cht"])
        distance(min: 0.0,max: 100.0)
    }
}
