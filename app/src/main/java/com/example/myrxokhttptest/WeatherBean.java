package com.example.myrxokhttptest;

public class WeatherBean {
    /**
     * city : 北京
     * data : {"zs_ag":{"info":"需注意远离过敏源，适当采取防护措施。","name":"过敏指数","type":"较易发"},"zs_cl":{"info":"天气不错，空气清新。","name":"晨练指数","type":"适宜"},"zs_cy":{"info":"建议穿薄外套或牛仔裤等服装。","name":"穿衣指数","type":"较舒适"},"zs_dy":{"info":"风稍大会对垂钓产生一定影响。","name":"钓鱼指数","type":"较适宜"},"zs_ffz":{"info":"温暖舒适，较适宜放风筝。","name":"放风筝指数","type":"较适宜"},"zs_fh":{"info":"温度未达到风寒所需的低温，稍作防寒准备即可。","name":"风寒指数","type":"无"},"zs_fs":{"info":"涂抹12-15SPF，PA+护肤品。","name":"防晒指数","type":"较弱"},"zs_gj":{"info":"这种好天气去逛街可使身心畅快放松。","name":"逛街指数","type":"适宜"},"zs_gm":{"info":"无明显降温，感冒机率较低。","name":"感冒指数","type":"少发"},"zs_hc":{"info":"天气较好，适宜划船及嬉玩水上运动。","name":"划船指数","type":"适宜"},"zs_hz":{"info":"请选用中性保湿型霜类化妆品。","name":"化妆指数","type":"保湿"},"zs_jt":{"info":"气象条件良好，车辆可以正常行驶。","name":"交通指数","type":"良好"},"zs_kqwr":{"info":"易感人群应适当减少室外活动。","name":"空气污染扩散条件指数","type":"中"},"zs_kt":{"info":"体感舒适，不需要开启空调。","name":"空调开启指数","type":"较少开启"},"zs_lk":{"info":"天气较好，路面较干燥，路况较好。","name":"路况指数","type":"干燥"},"zs_ls":{"info":"天气不错，抓紧时机让衣物晒太阳吧。","name":"晾晒指数","type":"适宜"},"zs_ly":{"info":"天气较好，丝毫不会影响您出行的心情。","name":"旅游指数","type":"适宜"},"zs_mf":{"info":"好天气将为美发创造健康洁净的环境。","name":"美发指数","type":"极适宜"},"zs_pj":{"info":"适量的饮用啤酒，注意不要过量。","name":"啤酒指数","type":"较适宜"},"zs_ssd":{"info":"白天晴，早晚偏凉，午后舒适。","name":"舒适度指数","type":"较舒适"},"zs_tyj":{"info":"建议佩戴透射比为1级的浅色太阳镜","name":"太阳镜指数","type":"必要"},"zs_xc":{"info":"风力较大，洗车后会蒙上灰尘。","name":"洗车指数","type":"较不宜"},"zs_xq":{"info":"温度适宜，心情会不错。","name":"心情指数","type":"较好"},"zs_yd":{"info":"天气较好，尽情感受运动的快乐吧。","name":"运动指数","type":"适宜"},"zs_yh":{"info":"不用担心天气来调皮捣乱而影响了兴致。","name":"约会指数","type":"较适宜"},"zs_ys":{"info":"天气较好，不用带雨伞。","name":"雨伞指数","type":"不带伞"},"zs_ysh":{"info":"只要您稍作准备就可以放心外出。","name":"夜生活指数","type":"较适宜"},"zs_zs":{"info":"天气舒适，令人神清气爽的一天，不用担心中暑的困扰。","name":"中暑指数","type":"无中暑风险"},"zs_zwx":{"info":"辐射较弱，涂擦SPF12-15、PA+护肤品。","name":"紫外线强度指数","type":"弱"}}
     * msg : 生活指数29项。
     * status : 0
     * update : 20210323110000
     * weathercode : 101010100
     */

    private String city;
    private DataBean data;
    private String msg;
    private String status;
    private String update;
    private String weathercode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(String weathercode) {
        this.weathercode = weathercode;
    }

    public static class DataBean {
        /**
         * zs_ag : {"info":"需注意远离过敏源，适当采取防护措施。","name":"过敏指数","type":"较易发"}
         * zs_cl : {"info":"天气不错，空气清新。","name":"晨练指数","type":"适宜"}
         * zs_cy : {"info":"建议穿薄外套或牛仔裤等服装。","name":"穿衣指数","type":"较舒适"}
         * zs_dy : {"info":"风稍大会对垂钓产生一定影响。","name":"钓鱼指数","type":"较适宜"}
         * zs_ffz : {"info":"温暖舒适，较适宜放风筝。","name":"放风筝指数","type":"较适宜"}
         * zs_fh : {"info":"温度未达到风寒所需的低温，稍作防寒准备即可。","name":"风寒指数","type":"无"}
         * zs_fs : {"info":"涂抹12-15SPF，PA+护肤品。","name":"防晒指数","type":"较弱"}
         * zs_gj : {"info":"这种好天气去逛街可使身心畅快放松。","name":"逛街指数","type":"适宜"}
         * zs_gm : {"info":"无明显降温，感冒机率较低。","name":"感冒指数","type":"少发"}
         * zs_hc : {"info":"天气较好，适宜划船及嬉玩水上运动。","name":"划船指数","type":"适宜"}
         * zs_hz : {"info":"请选用中性保湿型霜类化妆品。","name":"化妆指数","type":"保湿"}
         * zs_jt : {"info":"气象条件良好，车辆可以正常行驶。","name":"交通指数","type":"良好"}
         * zs_kqwr : {"info":"易感人群应适当减少室外活动。","name":"空气污染扩散条件指数","type":"中"}
         * zs_kt : {"info":"体感舒适，不需要开启空调。","name":"空调开启指数","type":"较少开启"}
         * zs_lk : {"info":"天气较好，路面较干燥，路况较好。","name":"路况指数","type":"干燥"}
         * zs_ls : {"info":"天气不错，抓紧时机让衣物晒太阳吧。","name":"晾晒指数","type":"适宜"}
         * zs_ly : {"info":"天气较好，丝毫不会影响您出行的心情。","name":"旅游指数","type":"适宜"}
         * zs_mf : {"info":"好天气将为美发创造健康洁净的环境。","name":"美发指数","type":"极适宜"}
         * zs_pj : {"info":"适量的饮用啤酒，注意不要过量。","name":"啤酒指数","type":"较适宜"}
         * zs_ssd : {"info":"白天晴，早晚偏凉，午后舒适。","name":"舒适度指数","type":"较舒适"}
         * zs_tyj : {"info":"建议佩戴透射比为1级的浅色太阳镜","name":"太阳镜指数","type":"必要"}
         * zs_xc : {"info":"风力较大，洗车后会蒙上灰尘。","name":"洗车指数","type":"较不宜"}
         * zs_xq : {"info":"温度适宜，心情会不错。","name":"心情指数","type":"较好"}
         * zs_yd : {"info":"天气较好，尽情感受运动的快乐吧。","name":"运动指数","type":"适宜"}
         * zs_yh : {"info":"不用担心天气来调皮捣乱而影响了兴致。","name":"约会指数","type":"较适宜"}
         * zs_ys : {"info":"天气较好，不用带雨伞。","name":"雨伞指数","type":"不带伞"}
         * zs_ysh : {"info":"只要您稍作准备就可以放心外出。","name":"夜生活指数","type":"较适宜"}
         * zs_zs : {"info":"天气舒适，令人神清气爽的一天，不用担心中暑的困扰。","name":"中暑指数","type":"无中暑风险"}
         * zs_zwx : {"info":"辐射较弱，涂擦SPF12-15、PA+护肤品。","name":"紫外线强度指数","type":"弱"}
         */

        private ZsAgBean zs_ag;
        private ZsClBean zs_cl;
        private ZsCyBean zs_cy;
        private ZsDyBean zs_dy;
        private ZsFfzBean zs_ffz;
        private ZsFhBean zs_fh;
        private ZsFsBean zs_fs;
        private ZsGjBean zs_gj;
        private ZsGmBean zs_gm;
        private ZsHcBean zs_hc;
        private ZsHzBean zs_hz;
        private ZsJtBean zs_jt;
        private ZsKqwrBean zs_kqwr;
        private ZsKtBean zs_kt;
        private ZsLkBean zs_lk;
        private ZsLsBean zs_ls;
        private ZsLyBean zs_ly;
        private ZsMfBean zs_mf;
        private ZsPjBean zs_pj;
        private ZsSsdBean zs_ssd;
        private ZsTyjBean zs_tyj;
        private ZsXcBean zs_xc;
        private ZsXqBean zs_xq;
        private ZsYdBean zs_yd;
        private ZsYhBean zs_yh;
        private ZsYsBean zs_ys;
        private ZsYshBean zs_ysh;
        private ZsZsBean zs_zs;
        private ZsZwxBean zs_zwx;

        public ZsAgBean getZs_ag() {
            return zs_ag;
        }

        public void setZs_ag(ZsAgBean zs_ag) {
            this.zs_ag = zs_ag;
        }

        public ZsClBean getZs_cl() {
            return zs_cl;
        }

        public void setZs_cl(ZsClBean zs_cl) {
            this.zs_cl = zs_cl;
        }

        public ZsCyBean getZs_cy() {
            return zs_cy;
        }

        public void setZs_cy(ZsCyBean zs_cy) {
            this.zs_cy = zs_cy;
        }

        public ZsDyBean getZs_dy() {
            return zs_dy;
        }

        public void setZs_dy(ZsDyBean zs_dy) {
            this.zs_dy = zs_dy;
        }

        public ZsFfzBean getZs_ffz() {
            return zs_ffz;
        }

        public void setZs_ffz(ZsFfzBean zs_ffz) {
            this.zs_ffz = zs_ffz;
        }

        public ZsFhBean getZs_fh() {
            return zs_fh;
        }

        public void setZs_fh(ZsFhBean zs_fh) {
            this.zs_fh = zs_fh;
        }

        public ZsFsBean getZs_fs() {
            return zs_fs;
        }

        public void setZs_fs(ZsFsBean zs_fs) {
            this.zs_fs = zs_fs;
        }

        public ZsGjBean getZs_gj() {
            return zs_gj;
        }

        public void setZs_gj(ZsGjBean zs_gj) {
            this.zs_gj = zs_gj;
        }

        public ZsGmBean getZs_gm() {
            return zs_gm;
        }

        public void setZs_gm(ZsGmBean zs_gm) {
            this.zs_gm = zs_gm;
        }

        public ZsHcBean getZs_hc() {
            return zs_hc;
        }

        public void setZs_hc(ZsHcBean zs_hc) {
            this.zs_hc = zs_hc;
        }

        public ZsHzBean getZs_hz() {
            return zs_hz;
        }

        public void setZs_hz(ZsHzBean zs_hz) {
            this.zs_hz = zs_hz;
        }

        public ZsJtBean getZs_jt() {
            return zs_jt;
        }

        public void setZs_jt(ZsJtBean zs_jt) {
            this.zs_jt = zs_jt;
        }

        public ZsKqwrBean getZs_kqwr() {
            return zs_kqwr;
        }

        public void setZs_kqwr(ZsKqwrBean zs_kqwr) {
            this.zs_kqwr = zs_kqwr;
        }

        public ZsKtBean getZs_kt() {
            return zs_kt;
        }

        public void setZs_kt(ZsKtBean zs_kt) {
            this.zs_kt = zs_kt;
        }

        public ZsLkBean getZs_lk() {
            return zs_lk;
        }

        public void setZs_lk(ZsLkBean zs_lk) {
            this.zs_lk = zs_lk;
        }

        public ZsLsBean getZs_ls() {
            return zs_ls;
        }

        public void setZs_ls(ZsLsBean zs_ls) {
            this.zs_ls = zs_ls;
        }

        public ZsLyBean getZs_ly() {
            return zs_ly;
        }

        public void setZs_ly(ZsLyBean zs_ly) {
            this.zs_ly = zs_ly;
        }

        public ZsMfBean getZs_mf() {
            return zs_mf;
        }

        public void setZs_mf(ZsMfBean zs_mf) {
            this.zs_mf = zs_mf;
        }

        public ZsPjBean getZs_pj() {
            return zs_pj;
        }

        public void setZs_pj(ZsPjBean zs_pj) {
            this.zs_pj = zs_pj;
        }

        public ZsSsdBean getZs_ssd() {
            return zs_ssd;
        }

        public void setZs_ssd(ZsSsdBean zs_ssd) {
            this.zs_ssd = zs_ssd;
        }

        public ZsTyjBean getZs_tyj() {
            return zs_tyj;
        }

        public void setZs_tyj(ZsTyjBean zs_tyj) {
            this.zs_tyj = zs_tyj;
        }

        public ZsXcBean getZs_xc() {
            return zs_xc;
        }

        public void setZs_xc(ZsXcBean zs_xc) {
            this.zs_xc = zs_xc;
        }

        public ZsXqBean getZs_xq() {
            return zs_xq;
        }

        public void setZs_xq(ZsXqBean zs_xq) {
            this.zs_xq = zs_xq;
        }

        public ZsYdBean getZs_yd() {
            return zs_yd;
        }

        public void setZs_yd(ZsYdBean zs_yd) {
            this.zs_yd = zs_yd;
        }

        public ZsYhBean getZs_yh() {
            return zs_yh;
        }

        public void setZs_yh(ZsYhBean zs_yh) {
            this.zs_yh = zs_yh;
        }

        public ZsYsBean getZs_ys() {
            return zs_ys;
        }

        public void setZs_ys(ZsYsBean zs_ys) {
            this.zs_ys = zs_ys;
        }

        public ZsYshBean getZs_ysh() {
            return zs_ysh;
        }

        public void setZs_ysh(ZsYshBean zs_ysh) {
            this.zs_ysh = zs_ysh;
        }

        public ZsZsBean getZs_zs() {
            return zs_zs;
        }

        public void setZs_zs(ZsZsBean zs_zs) {
            this.zs_zs = zs_zs;
        }

        public ZsZwxBean getZs_zwx() {
            return zs_zwx;
        }

        public void setZs_zwx(ZsZwxBean zs_zwx) {
            this.zs_zwx = zs_zwx;
        }

        public static class ZsAgBean {
            /**
             * info : 需注意远离过敏源，适当采取防护措施。
             * name : 过敏指数
             * type : 较易发
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsClBean {
            /**
             * info : 天气不错，空气清新。
             * name : 晨练指数
             * type : 适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsCyBean {
            /**
             * info : 建议穿薄外套或牛仔裤等服装。
             * name : 穿衣指数
             * type : 较舒适
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsDyBean {
            /**
             * info : 风稍大会对垂钓产生一定影响。
             * name : 钓鱼指数
             * type : 较适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsFfzBean {
            /**
             * info : 温暖舒适，较适宜放风筝。
             * name : 放风筝指数
             * type : 较适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsFhBean {
            /**
             * info : 温度未达到风寒所需的低温，稍作防寒准备即可。
             * name : 风寒指数
             * type : 无
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsFsBean {
            /**
             * info : 涂抹12-15SPF，PA+护肤品。
             * name : 防晒指数
             * type : 较弱
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsGjBean {
            /**
             * info : 这种好天气去逛街可使身心畅快放松。
             * name : 逛街指数
             * type : 适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsGmBean {
            /**
             * info : 无明显降温，感冒机率较低。
             * name : 感冒指数
             * type : 少发
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsHcBean {
            /**
             * info : 天气较好，适宜划船及嬉玩水上运动。
             * name : 划船指数
             * type : 适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsHzBean {
            /**
             * info : 请选用中性保湿型霜类化妆品。
             * name : 化妆指数
             * type : 保湿
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsJtBean {
            /**
             * info : 气象条件良好，车辆可以正常行驶。
             * name : 交通指数
             * type : 良好
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsKqwrBean {
            /**
             * info : 易感人群应适当减少室外活动。
             * name : 空气污染扩散条件指数
             * type : 中
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsKtBean {
            /**
             * info : 体感舒适，不需要开启空调。
             * name : 空调开启指数
             * type : 较少开启
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsLkBean {
            /**
             * info : 天气较好，路面较干燥，路况较好。
             * name : 路况指数
             * type : 干燥
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsLsBean {
            /**
             * info : 天气不错，抓紧时机让衣物晒太阳吧。
             * name : 晾晒指数
             * type : 适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsLyBean {
            /**
             * info : 天气较好，丝毫不会影响您出行的心情。
             * name : 旅游指数
             * type : 适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsMfBean {
            /**
             * info : 好天气将为美发创造健康洁净的环境。
             * name : 美发指数
             * type : 极适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsPjBean {
            /**
             * info : 适量的饮用啤酒，注意不要过量。
             * name : 啤酒指数
             * type : 较适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsSsdBean {
            /**
             * info : 白天晴，早晚偏凉，午后舒适。
             * name : 舒适度指数
             * type : 较舒适
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsTyjBean {
            /**
             * info : 建议佩戴透射比为1级的浅色太阳镜
             * name : 太阳镜指数
             * type : 必要
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsXcBean {
            /**
             * info : 风力较大，洗车后会蒙上灰尘。
             * name : 洗车指数
             * type : 较不宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsXqBean {
            /**
             * info : 温度适宜，心情会不错。
             * name : 心情指数
             * type : 较好
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsYdBean {
            /**
             * info : 天气较好，尽情感受运动的快乐吧。
             * name : 运动指数
             * type : 适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsYhBean {
            /**
             * info : 不用担心天气来调皮捣乱而影响了兴致。
             * name : 约会指数
             * type : 较适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsYsBean {
            /**
             * info : 天气较好，不用带雨伞。
             * name : 雨伞指数
             * type : 不带伞
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsYshBean {
            /**
             * info : 只要您稍作准备就可以放心外出。
             * name : 夜生活指数
             * type : 较适宜
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsZsBean {
            /**
             * info : 天气舒适，令人神清气爽的一天，不用担心中暑的困扰。
             * name : 中暑指数
             * type : 无中暑风险
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ZsZwxBean {
            /**
             * info : 辐射较弱，涂擦SPF12-15、PA+护肤品。
             * name : 紫外线强度指数
             * type : 弱
             */

            private String info;
            private String name;
            private String type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
