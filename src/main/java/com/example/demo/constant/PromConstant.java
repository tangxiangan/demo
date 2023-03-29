package com.example.demo.constant;

public interface PromConstant {
    /**
     * prometheus-查询SUCCESS
     */
    public static final String SUCCESS = "success";

    /**prometheus-查询参数*/
    public static final String QUERY = "/api/v1/query?query={query}&time={time}";

    public static final String QUERY_RANGE = "/api/v1/query_range?query={query}&start={start}&end={end}&step={step}";

    public static final String QUERY_PARAM = "query";
    public static final String START = "start";

    public static final String END = "end";

    public static final String STEP = "step";

    public static final String TIME = "time";

    /**服务器的CPU利用率*/
    public static final String PROCESS_CPU_COUNT= "(1 - avg(rate(node_cpu_seconds_total{mode='idle',name=~'.*.*'}[2m])) by (instance)) * 100";

    /**服务器的内存利用率*/
    public static final String PROCESS_MEMORY_COUNT= "(1 - (node_memory_MemAvailable_bytes{name=~\".*.*\"} / (node_memory_MemTotal_bytes{name=~\".*.*\"})))* 100";

    /**服务器的磁盘用率*/
    public static final String PROCESS_DISK_COUNT= "(1 - (node_memory_MemAvailable_bytes{name=~\".*.*\"} / (node_memory_MemTotal_bytes{name=~\".*.*\"})))* 100";
}
