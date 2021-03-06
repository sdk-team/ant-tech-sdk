<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecCardQueryRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'tx' => 'tx',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->tx) {
            $res['tx'] = null !== $this->tx ? $this->tx->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecCardQueryRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['tx'])){
            $model->tx = Transaction::fromMap($map['tx']);
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example mypoints
     * @var string
     */
    public $chainId;

    /**
     * @description 交易信息
     * @example 
     * @var Transaction
     */
    public $tx;

}
