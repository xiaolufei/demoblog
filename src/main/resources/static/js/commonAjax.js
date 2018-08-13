var common = {
	showLoadingImage : true,
	/**
	 * ajax 请求模板
	 * 
	 * @param url
	 * @param method
	 * @param paramData
	 * @param successfunc
	 * @param errorfunc
	 * @param loadingBox
	 *            加载区域的className,不传默认用loadingbox
	 */
	asyncAjaxRequest : function(url, method, paramData, successfunc, errorfunc,
			loadingBox) {
		this.asyncAjaxDataRequest(url, method, paramData, "JSON", successfunc,
				errorfunc, loadingBox);
	},
	/**
	 * Ajax异步请求,注意:跟前一个方面的区别在于,数据类型是指定的,而前面是固定死为JSON的数据类型
	 * 
	 * @param url
	 * @param method
	 * @param data
	 * @param dataType
	 * @param successfunc
	 * @param errorfunc
	 * @param loadingBox
	 *            加载区域的className,不传默认用loadingbox
	 */
	asyncAjaxDataRequest : function(url, method, data, dataType, successfunc,
			errorfunc, loadingBox) {
		
		$.ajax({
			url : common.updateUrl(url),
			type : method,
			data : JSON.stringify(data),
			contentType : 'application/json;charset=utf-8',// 请求内容为json
			dataType : 'JSON',
			beforeSend : function(xhr) {
				xhr.setRequestHeader("request_ajax_type", "0");
			},
			success : function(jsonstr) {
				successfunc && successfunc(JSON.parse(jsonstr));
			},
			error : function(jsonstr) {
				errorfunc && errorfunc(JSON.parse(jsonstr));
			}
		});
	},
	updateUrl : function(url) {
		if (/(&|\?)+/.test(url)) {
			url += '&_=' + new Date().getTime();
		} else {
			url += '?_=' + new Date().getTime();
		}
		return url;
	},

    /**
     * 创建cookie
     */
    setCookie : function(_name, _value, expiredays, path) {
        var nowDate = new Date();
        if (!path) {
            path = ctx;
        }
        if (expiredays) {
            nowDate.setDate(nowDate.getDate() + expiredays);
            document.cookie = _name + '=' + escape(_value) + ';expires='
                + nowDate.toGMTString() + ';path=' + path;
        } else {
            document.cookie = _name + '=' + escape(_value);
        }

    },

    /**
     * 获取cookie
     */
    getCookie : function(_name) {
        if (document.cookie.length > 0) {
            var _start = document.cookie.indexOf(_name + '=');
            if (_start != -1) {
                _start = _start + _name.length + 1;
                var _end = document.cookie.indexOf(';', _start);
                if (_end == -1) {
                    _end = document.cookie.length;
                }
                return unescape(document.cookie.substring(_start, _end));
            }
        }
        return '';
    },

    /**
     * 创建cookie
     */
    addCookie : function(_name, _value, expiredays, path) {
        var nowDate = new Date();
        if (!path) {
            path = ctx;
        }
        if (expiredays == '1') {
            nowDate.setDate(nowDate.getDate() + expiredays);
            document.cookie = _name + '=' + encodeURIComponent(_value)
                + ';expires=' + nowDate.toGMTString() + ';path=' + path;
        } else if (expiredays == '-1') {
            document.cookie = _name + '=' + encodeURIComponent(_value)
                + ';expires=' + ';path=' + path;
        } else {
            document.cookie = _name + '=' + encodeURIComponent(_value);
        }
    },

    // 清除cookie
    deleteCookie : function(cname) {
        var c = common.getCookie(cname);
        if (c != null && c != "") {
            var exp = new Date();
            exp.setTime(exp.getTime() - 1);
            document.cookie = cname + "=;expires=" + exp.toGMTString()
                + ";path=/";
        }
    },


}